//Question 1
var arr1:number[] = [2,4,6,8,10];
var arr2:number[] = [...arr1,5,7,9];
console.log(arr2);
console.log(arr1);
//Question 2
var arr3:number[] = [...arr2];
console.log(arr3);
//Question 3
var cold:string[] = ['autumn','winter'];
var warm:string[] = ['spring','summer'];
var seasons:string[] = [...cold,...warm];
console.log(seasons);
