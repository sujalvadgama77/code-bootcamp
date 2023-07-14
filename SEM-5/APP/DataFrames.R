std.data <- data.frame(
  Id = c(1:5),
  Name = c("Darshak","Roshan","Darshan","Jaivik","Sujal"),
  Cpi = c(8.0,7.6,6.6,5.6,7.6)
)

cat("\nStudent Information\n\n")
print(std.data)

cat("\n\nStructure of Data Frame\n")
a <- str(std.data)
print(a)

cat("\n\nStudents who has More than 7.5 CPI\n")

res <- std.data[std.data$Cpi > 7.5, ]
print(res)

cat("\n\nSummary of the Data Frame\n\n")
print(summary(std.data))