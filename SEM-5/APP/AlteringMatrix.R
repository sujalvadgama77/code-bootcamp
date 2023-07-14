a <- matrix(c(0:11),nrow = 3,byrow = TRUE,dimnames = list(row_names,col_names))
print(a)

cat("\n\nAdding a row in Matrix\n")
rbind(a,c(100,200,300,900))
print(a)

cat("\n\nAdding a column in Matrix\n")
cbind(a,c(400,500,600))
print(a)


cat("\n\nTranspose of a Matrix\n")
t(a)
print(a)