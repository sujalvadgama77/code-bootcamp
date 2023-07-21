getwd()
setwd("D:/22IT608")
data <- read.csv("stdData.csv")


# Create data for the graph.
v = data$SPI

# Give the chart file a name.
png(file = "StdDatahistogram.png")

# Create the histogram.
hist(v,xlab = "Weight",col = "cyan",border = "black")

# Save the file.
dev.off()