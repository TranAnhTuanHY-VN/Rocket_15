var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
//Question 1
var arr1 = [2, 4, 6, 8, 10];
var arr2 = __spreadArray(__spreadArray([], arr1, true), [5, 7, 9], false);
console.log(arr2);
console.log(arr1);
//Question 2
var arr3 = __spreadArray([], arr2, true);
console.log(arr3);
//Question 3
var cold = ['autumn', 'winter'];
var warm = ['spring', 'summer'];
var seasons = __spreadArray(__spreadArray([], cold, true), warm, true);
console.log(seasons);
