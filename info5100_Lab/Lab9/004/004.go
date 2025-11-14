package main

import (
	"fmt"
	"sync"
	"time"
)

var balance = 1000
var mu sync.Mutex

func withdraw(amount int, source string, wg *sync.WaitGroup) {
	defer wg.Done()
	fmt.Println("Attempting to withdraw", amount, "from", source)

	mu.Lock()
	fmt.Printf("Locked for %S\n", source)
	defer mu.Unlock()

	if balance >= amount {
		fmt.Printf("%s is withdrawing %d...\n", source, amount)
		time.Sleep(500 * time.Millisecond)
		balance -= amount
		fmt.Printf("%s completed. New balance: %d\n", source, balance)
	} else {
		fmt.Printf("%s failed. Insufficient funds.\n", source)
	}
}

func main() {
	var wg sync.WaitGroup
	wg.Add(2)

	go withdraw(700, "Phone Transfer", &wg)
	go withdraw(500, "ATM Withdrawal", &wg)

	wg.Wait()
	fmt.Println("Final Balance:", balance)
}
