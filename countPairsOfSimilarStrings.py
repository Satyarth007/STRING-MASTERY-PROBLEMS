class Solution:
    def similarPairs(self, words: List[str]) -> int:
        count=0
        for i in range(0,len(words)-1):
            a= set(words[i])
            for j in range(i+1,len(words)):
                b= set(words[j])
                if len(a.difference(b))==0 and len(b.difference(a))==0:
                    count+=1


        return count





        
