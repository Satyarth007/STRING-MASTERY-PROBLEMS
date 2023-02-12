class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        for i in s:
            if s.count(i)!=t.count(i):
                return i
        return t[len(t)-1]        
             
