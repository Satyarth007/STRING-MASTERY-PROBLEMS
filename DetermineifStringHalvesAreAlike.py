class Solution:
       
    def halvesAreAlike(self, s: str) -> bool:
        a=s[:len(s)//2]
        b=s[len(s)//2:]
        ac=0
        bc=0
        vowel=['a','e','i','o','u','A','E','I','O','U']
        for i in range(len(s)//2):
            if a[i] in vowel : ac+=1
            if b[i] in vowel: bc+=1
          
        return ac==bc
