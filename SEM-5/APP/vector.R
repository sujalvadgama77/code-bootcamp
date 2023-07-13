vec1 <- c(1,2,3)
vec2 <- c(10,20,30,40,50,60,70,80,90)

cat("1st Vector\n",vec1)
cat("\n\n2nd Vector\n",vec2)

res <- array(c(vec1,vec2),dim=c(3,4,1))
print(res)