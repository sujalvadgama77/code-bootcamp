list_data<-list(c("Darshak","Roshan","Darshan"),
                matrix(c(40,80,60,70,90,80),nrow=3),
                c("BCA","MCA","MBA"))

list_data2<-list(c("Jaivik","Ali","Rahil"),
                 matrix(c(40,80,60,70,90,80),nrow=3),
                 c("M.Tech","BCA","MS"))

v1 <- unlist(list_data)
v2 <- unlist(list_data2)
cat("\n")
print(v1)
cat("\n")
print(v2)