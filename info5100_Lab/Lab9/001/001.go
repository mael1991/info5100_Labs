package main

import "fmt"

var balance = 1000

// Simple function: no goroutines yet
func withdraw(amount int, source string) {
	if balance >= amount {
		fmt.Printf("%S withdraws %d\n", source, amount)
		balance -= amount
	}else {
		fmt.Printf("%s failed: insufficient funds.\n", source)
	}
}

func main(){
	withdraw(300, "Phone Transfer")
	withdraw(500, "ATM Withdrawal")
	withdraw(500, "Outer Space")

	fmt.Println("Final Balance:", balance )
}