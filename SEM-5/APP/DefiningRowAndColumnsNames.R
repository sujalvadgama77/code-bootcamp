a <- matrix(c(11,12,13,14,15,16),2,3,TRUE)
print(a)

cat("\nSequentially Arranged By Column\n\n")

row_names = c("row1", "row2", "row3")
col_names = c("col1", "col2", "col3", "col4")

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