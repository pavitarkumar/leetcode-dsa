/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    const len = nums.length;
    for(let i = 0;i < len ; i++){
        init = fn(init,nums[i]);
     }
     return init;
};