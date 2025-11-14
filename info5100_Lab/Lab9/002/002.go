package main

import "fmt"
import "time"

var balance = 1000

// Simple function: no goroutines yet
func withdraw(amount int, source string) {
	if balance >= amount {
		fmt.Printf("%S withdraws %d...\n", source, amount)
		time.Sleep(time.Millisecond * 500)
		balance -= amount
	}else {
		fmt.Printf("%s failed: insufficient funds.\n", source)
	}
}

func main(){
	go withdraw(700, "phone Transfer")
	go withdraw(500, "ATM Withdrawal")

	time.Sleep(2 * time.Second)
	fmt.Println("Final Balance:", balance)
}