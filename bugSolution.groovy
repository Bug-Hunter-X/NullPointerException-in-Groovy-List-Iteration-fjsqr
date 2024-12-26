```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.each { item ->
      println item
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
myMethod(['a', 'b', 'c'])