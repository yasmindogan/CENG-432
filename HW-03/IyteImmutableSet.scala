class IyteImmutableSet (val arraybuffer:Array[Int],val initalSize:Int,val initalindex:Int){
var arrayBuffer =arraybuffer
var newinitalSize=initalSize
var newinitalindex= initalindex

var searchValued : Int = 0

def add(element:Int):IyteImmutableSet={
if(!contains(element)){
if(newinitalindex<= newinitalSize ){
arrayBuffer (newinitalindex)=element
newinitalindex += 1

}
else{
arrayBuffer (newinitalindex )=element
newinitalindex += 1

}
}


new IyteImmutableSet(arrayBuffer,newinitalSize,newinitalindex)
}
def contains(sValue:Int):Boolean = {
// val flag=0
//Binary search algorithm
var inital = 0
var last = newinitalindex -1


while (inital <= last){

searchValued = (inital + last)/2;

if (arrayBuffer(searchValued ) == sValue){
return true
}
else if (arrayBuffer (searchValued ) > sValue){
last = searchValued - 1;
}
else{
inital = searchValued + 1;
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
object IyteImmutableSet{

def apply() = {
var arrayBuffer =new Array[Int](20)
//var arrayinner=new Array[Int](20)
var initalSize=10
var initalindex= 0
new IyteImmutableSet(arrayBuffer,initalSize,initalindex)
}

}
