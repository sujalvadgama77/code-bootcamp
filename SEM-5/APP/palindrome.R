n <- as.integer(readline(prompt="Enter a Number : "))
num <- n
rev <- 0L
while(n != 0){
  rem = n %% 10
  rev = rem + (rev*10)
  n = as.integer(n/10)
}
if(num == rev){
  cat(num,"is a Palindrome number !")  
}else{
  cat(num,"is not a Palindrome number !")
}