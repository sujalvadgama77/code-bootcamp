library(plotrix)
x <-  c(21, 62, 10,53)
lbl <-  c("London","New York","Singapore","Mumbai")


png(file = "3d_pie_chart.jpg")


pie3D(x,labels = lbl,explode = 0.1, main = "Pie Chart of Countries ")

dev.off()