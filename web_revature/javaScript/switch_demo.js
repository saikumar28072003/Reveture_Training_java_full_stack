let num1,num2;
let result,operation;

num1=parseInt(prompt("enter the first number!!!!"));
num2=parseInt(prompt("enter the second number!!!!"));
operation=prompt("enter the operation +, -, *, /");

switch(operation){
    
       case "+":
        result=num1+num2;
        break;

        case "-":
        result=num1-num2;
        break;

        case "*":
        result=num1*num2;
        break;

        case "/":
        result=num1/num2;
        break;

        default:
        console.log("invalid operation.....");
        break;
}
alert(result);