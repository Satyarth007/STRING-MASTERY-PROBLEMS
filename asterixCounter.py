class Solution:
    def countAsterisks(self, s: str) -> int:
        ca=0
        cb=0
        for i in s:
            if i=='|':
                cb=cb+1
            elif  (cb%2==0 and i=='*'):
                ca=ca+1
        return ca            
