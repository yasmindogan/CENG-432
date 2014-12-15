case class User(name: String, email: String, grade: Int)
trait UserManagerTrait {
def add(name: String, email: String, grade: Int) : Option[User]
def getUser(email: String) : Option[User]
def getUserListForGrade(grade: Int) : List[User]
def getCertainGrades(gradeSelector: (Int) => Boolean): List[String]
}
object UserManager extends UserManagerTrait {
  var users:List[User]=List();
  override def add(name: String, email: String, grade: Int) : Option[User]={
    var temp=new User(name,email,grade)
    if(users.contains(temp)){
      None;
    }
    else{
      users=users:+temp;
      Option(temp);
    }
  }
 override def getUser(email: String) : Option[User] = {
   users.find(user => user.email == email);
 }
   override def getUserListForGrade(grade: Int) : List[User] = {
    
     users.filter(user=>user.grade==grade)
   }
   
   override def getCertainGrades(gradeSelector: (Int) => Boolean): List[String] = {  
   // users.filter(user=>gradeSelector(user.grade)).groupBy(user => user.grade).map(t => (t._1,t._2.map(s => s.name)))
   users.filter(user=>gradeSelector(user.grade)).map(user =>user.name)
   }
}
