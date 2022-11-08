function Boy(name, age, male,lang){
    this.name = name;
    this.age =  age;
    this.male = male;
    this.lang = lang;
}

var boy1 = new Boy("Abhishek", 20, true, ["hindi", "english", "bengali"]);
var boy2 = new Boy("Ashish", 22, true, ["hindi", "english"]);

console.log(boy1);
console.log(boy2.name + " " + boy2.age);