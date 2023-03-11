package day22overridingcapsilation;

public class Animal {

    /*
    1) Sometimes using method directly from parent class may not be enough for us.
     We may need the method to specify.
     When we need the method to specify, we change the method body.
     This is called "Method Overriding"
    2)We cannot touch "Method Signature" in "Method Signature"(Method Name and Method Parameters) in "Method Overriding"
    3)The method in child class(Overriding Method) can use "same" or "wider" accesss modifer than the method in parent class(Overridden Method)
    4)When you change the "return type" in "method overriding", from child to parent you must have "IS-A" relationships.
    5)Return Type of the Overridden Method can be the "top return type" of the Overriding Method
    6)If there is "IS-A" relationship between return types, those called "Covariant Return Types"
    7)Between the"Wrapper Classes" there is no "parent-child relationship" that is why you cannot have "IS-A" relationship
     If you don not have "IS-A" relationship you cannot change return type in "Method Overriding"
    8)Between the"primitive data types" there is no "parent-child relationship" that is why you cannot have "IS-A" relationship
     If you don not have "IS-A" relationship you cannot change return type in "Method Overriding"
     9)If the return type is void you cannot change it in method overriding
     10)"private" methods in "parent class" cannot be overridden
     11)"static" method cannot be overridden

     "final" keyword in Java:
     1)"final" keyword can be used for variables
        If you use "final" keyword for variables i)You have to initialize the variable ii)After assigning a value you cannot update the value.
     2)"final" keyword can be used for classes
        If you use "final" keyword  for a class, the class cannot have "Child Class"
     3)"final" keyword can be used for methods
       If you use "final" keyword for methods, the method cannot be overridden.
       The body of a "final method" cannot be updated, so it cannot be overridden because in overriding we update the method body

      12) Polymorphism = Method Overloading + Method Overriding
      What is the difference between "Method Overloading" and "Method Overriding"?
        i)




     */

    public void eat(){
        System.out.println("Animals eat");
    }

    public Animal creater(){
        return new Animal();
    }
    public Integer number() {
        return 123;
    }
        public int num() {
            return 12;

        }
    }

