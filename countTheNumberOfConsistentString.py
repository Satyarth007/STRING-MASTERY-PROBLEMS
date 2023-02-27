class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        al=list(allowed)
        count=0
        for i in words:
            sum=0
            for j in al:
                sum+= i.count(j)
            if sum== len(i): count+=1
        return count    

         
            
