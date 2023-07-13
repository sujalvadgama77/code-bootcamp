fact <- function(n) {
  if(n==0 || n==1)
  {
    return(1)
  } else{
    return(n*fact(n-1))
  }
}

fac <- as.integer(readline(prompt="Enter a number for factorial : "))
ans<-fact(fac)
cat("Factorial of ",fac," is : ",ans)