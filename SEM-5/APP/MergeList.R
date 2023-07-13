list_data<-list(c("Darshak","Roshan","Darshan"),
                matrix(c(40,80,60,70,90,80),nrow=3),
                c("BCA","MCA","MBA"))

list_data2<-list(c("Jaivik","Ali","Rahil"),
                 matrix(c(40,80,60,70,90,80),nrow=3),
                 c("M.Tech","BCA","MS"))
cat("\nMearge List\n")
A<-list(list_data,list_data2)
cat("\n\n")
print(A)
