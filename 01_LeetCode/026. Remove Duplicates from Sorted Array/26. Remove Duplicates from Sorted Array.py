#!/usr/bin/env python3
# -*- coding: utf-8 -*-

class Solution:
    def removeDuplicates(self, nums):
        if(nums is None):
            return 0
        i = 0
        for j in range(1, len(nums)):
            if nums[j] != nums[i]:
                j+=1
                nums[i] = nums[j]
        return i + 1