class IyteMutableSet {
var arrayBuffer =new Array[Int](20)

var initalSize=10
var initalindex= 0
var searchValued : Int = 0

def add(element:Int){
if(!contains(element)){
if(initalindex <= initalSize ){

arrayBuffer (initalindex )=element
initalindex += 1

}
else{
arrayBuffer (initalindex )=element
initalindex += 1

}
}

}
def contains(sValue:Int):Boolean = {
// val flag=0
//Binary search algorithm
var initial= 0
var last = initalindex -1
while (initial <= last){

searchValued = (initial + last)/2;

if (arrayBuffer(searchValued ) == sValue){
return true
}
else if (arrayBuffer (searchValued ) > sValue){
last = searchValued - 1;
}
else{
initial= searchValued + 1;
}
}
return false
}
override def toString:String={
var result= ""

if(initalindex != 0){

for(i<-0 to initalindex -1 ){
result += arrayBuffer (i).toString + ", "
}
}
else{

}
result.dropRight(1)
}
}
object IyteMutableSet
{
def apply() = new IyteMutableSet()
}
