R <- matrix(c(5:16),nrow=4,ncol=3)
S <- matrix(c(1:12),nrow=4,ncol=3)

cat("\n\nAddition\n")
sum <- R+S
print(sum)

cat("\n\nSubtraction\n")
sub <- R-S
print(sub)

cat("\n\nMultiplication\n")
mul <- R*S
print(mul)

cat("\n\nMultiplication by Constant\n")
mul1 <- R*12
print(mul1)

cat("\n\nDivision\n")
div <- R/S
print(div)