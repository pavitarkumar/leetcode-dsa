/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let size = 0;
    let ans = [];
    for(let i = 0; i < arr.length ;i++){
        if(fn(arr[i],i)) ans[size++] = arr[i];
    }
    return ans;
};