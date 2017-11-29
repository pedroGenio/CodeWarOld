function iqTest(numbers){
  
// var number = ("2 4 6 9 10");
// var number = ("1 2 2 4");
var number = ("1 2 1 1");
var num = number.split(" ");
var index;
var index0;
var num2;
var restoAntigo;
var next = false;
var segundo = false;
for (var i = 0; i < num.length; i++) {
    var resto = num[i] % 2;
    if ( i === 0) {
        index0 = i;
        restoAntigo = resto;
    } 
    if ( i == 1) {
      if (restoAntigo == resto) {
        next = true;
      } else {
        index0 = i;
        segundo = true;
        restoAntigo = resto;
      }
      
    } 
    console.info("restoAntigo: " + restoAntigo);
    console.info("num: " + num[i]);
    
    if (next && (restoAntigo != resto)) {
      index = i;
      num2 = num[i];
      break;
    } else if (segundo && ((restoAntigo != resto) && i >=2 ))  {
      index = index0;
      num2 = num[index];
      break;
    } else if ((restoAntigo != resto) && i >=2 ) {
      index = index0;
      num2 = num[index];
      break;
    } else if (next == false && (restoAntigo == resto) && i >=2 ) {
      index = index0 - 1;
      num2 = num[index];
      break;
    }
}
console.info(index);
console.info(num2);


/* 
 * 
 function iqTest(numbers){
  numbers = numbers.split(' ')
  
  var evens = []
  var odds = []
  
  for (var i = 0; i < numbers.length; i++) {
    if (numbers[i] & 1) {
      odds.push(i + 1)
    } else {
      evens.push(i + 1)
    }
  }
  
  return evens.length === 1 ? evens[0] : odds[0]
}
    // MELHOR SOLUÇÃO
    function iqTest(numbers){
  numbers = numbers.split(" ").map(function(el){return parseInt(el)});
  
  var odd = numbers.filter(function(el){ return el % 2 === 1});
  var even = numbers.filter(function(el){ return el % 2 === 0});
  
  return odd.length < even.length ? (numbers.indexOf(odd[0]) + 1) : (numbers.indexOf(even[0]) + 1);
}
 */
}