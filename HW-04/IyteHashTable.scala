class IyteHashTable {
  private var Table_size = 128
  private var table = new Array[HashEntry](Table_size)
  new HashEntry()

  def hashFunction(key: String): Int = {
    var hash = 0
    var b = 378551;
    var a = 63689;

    var i = 0
    for (i <- 0 to key.length()){
     hash = hash * a+ key.charAt(i)
     a=a*b
      }
      
    return hash
  }

  def get(key: String): String = {

    var hash = hashFunction(key) % Table_size


    while (table(hash) != null && table(hash).getKey() != key)

                  hash = (hash + 1) % Table_size ;

            if (table(hash)== null)

                  return null;

            else

                  return table(hash).getValue();


  }
  def set(key: String, value: String): Unit = {

    var hash = hashFunction(key) % Table_size
    var array = table(hash)
     try {
       while (table(hash)!= null && table(hash).getKey()!= key) {
             hash = (hash + 1)% Table_size 
            } 
  
            array= new HashEntry(key, value);
    
    }
    catch {
      case e: Exception => println("exception caught: " + e);
    }
  }
   
    

}
object IyteHashTable
{
  def apply() = new IyteHashTable()
}
class HashEntry(val newKey: String, val newValue: String) {
  var key = newKey
  var value = newValue
  def this() {
    this(null, null);
  }
  def this(newKey: String) {
    this(newKey, null);
  }
  def getKey(): String = {
    key;
  }
  def getValue(): String = {
    value;
  }
}
