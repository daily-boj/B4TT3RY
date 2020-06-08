package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
	"time"
)

func main() {
	start := time.Now()
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Buffer(make([]byte, 10240000), 10240000)
	repeat := 0
	input := ""
	slice := []string{}
	fmt.Scanf("%d", &repeat)
	for i := 0; i < repeat; i++ {
		scanner.Scan()
		input = scanner.Text()
		stringToArray(&input, &slice)
		slice = parse(&slice)
		fmt.Println(strings.Join(slice, ""))
		slice = slice[:0]
	}
	elapsed := time.Since(start)
	fmt.Printf("%s\n", elapsed)
}

func stringToArray(str *string, arr *[]string) {
	for _, elem := range *str {
		*arr = append(*arr, string(elem))
	}
}

func parse(input *[]string) []string {
	result := []string{}
	index := 0
	for _, elem := range(*input) {
		switch (elem) {
		case "<":
			if index > 0 {
				index--
			}
		case ">":
			if index < len(result) {
				index++
			}
		case "-":
			if index > 0 {
				index--
				delete(&result, index)
			}
		default:
			insert(&result, index, &elem)
			index++
		}
	}
	return result
}

func insert(arr *[]string, index int, value *string) {
	if index >= 0 && index < len(*arr) {
		*arr = append((*arr)[:index + 1], (*arr)[index:]...)
		(*arr)[index] = *value
	} else {
		*arr = append(*arr, *value)
	}
}

func delete(arr *[]string, index int) {
	if index < len(*arr) {
		*arr = append((*arr)[:index], (*arr)[index + 1:]...)
	} else if index > 0 {
		*arr = (*arr)[:index - 1]
	}
}