
class IyteImmutableList(val node:Data){
  var head: Data = node;
  var size: Int = 0
  
  def this(){
    this(null);
  }
 def add (x: Int): IyteImmutableList= {
    new IyteImmutableList(new Data(x,head));
  }

  def toString1(): Unit = {
    var instance = this.head
    while(instance!= null){
      print(instance.getValue + ",")
      instance = instance.getNextData
    }
  }
}

class Data (head: Int,tail: Data){
  var value = head 
  var nextData = tail
  def getValue(): Int = {
    value
  }
  def getNextData():Data = {
    nextData
  }
  def set ( x: Data): Unit = {
    this.value = x.getValue()
    this.nextData = x.getNextData()
  }
  def setAfter ( x: Data): Unit = {
    nextData = x  
  }
  def setValue ( x: Int): Unit = {
    value = x
  }
 
 }


