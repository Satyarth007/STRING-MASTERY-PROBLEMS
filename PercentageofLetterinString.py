class Solution:
    def percentageLetter(self, s: str, l: str) -> int:
        return int(((s.count(l))/len(s))*100)
