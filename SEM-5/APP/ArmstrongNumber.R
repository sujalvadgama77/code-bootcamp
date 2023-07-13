n <- as.integer(readline(prompt="Enter a Number : "))
org <- n
temp <- n
len <- 0
sum <- 0L

while(temp != 0){
  temp <- floor(temp/10)
  len <- len+1
}

while(n != 0){
  remainder <- (n%%10)
  sum <- (sum + (remainder^len))
  n <- as.integer(n/10)
}

if(org == sum){
  cat("The Number",org,"is Armstrong Number")
}else{
  cat("The Number",org,"is not an Armstrong Number")
}