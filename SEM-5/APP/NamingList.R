list_data<-list(c("Darshak","Roshan","Darshan"),
                matrix(c(40,80,60,70,90,80),nrow=3),
                c("BCA","MCA","MBA"))

names(list_data)<-c("Students","Marks","Course")
print(list_data)
print(list_data[1])