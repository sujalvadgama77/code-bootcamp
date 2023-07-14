a <- matrix(c(0:11),nrow = 3,byrow = TRUE,)
print(a)

cat("\n\nAdding a row in Matrix\n")
add_row <- rbind(a,c(100,200,300,900))
print(add_row)

cat("\n\nAdding a column in Matrix\n")
add_col <- cbind(a,c(400,500,600))
print(add_col)


cat("\n\nTranspose of a Matrix\n")
transpose<-t(a)
print(transpose)