ggplot(data = <DATASET>, mapping = aes(<MAPPINGS>)) +
<GEOM_FUNCTION>()
ggplot(mpg, aes(x = cty)) + geom_histogram() + labs(x = “city
                                                      milages”)
ggplot(mpg, aes(x = cty)) + geom_freqpoly() + labs(x = “city milages”)
ggplot(mpg, aes(x = cty, y=hwy, color = class)) + geom_point() + labs(x
                                                                        = “city milages”)