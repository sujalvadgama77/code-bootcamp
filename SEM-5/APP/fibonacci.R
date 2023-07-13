n <- as.integer(readline(prompt="Enter a Number to print it's fibonacci series : "))
a <- 0
b <- 1
cat(a,b,"")
while(n != 0){
  c = a + b
  a = b
  b = c
  n = n-1
  cat(c,"")
}