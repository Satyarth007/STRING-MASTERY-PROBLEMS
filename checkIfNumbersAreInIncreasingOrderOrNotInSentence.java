class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        token = s.split(' ')
        d = []
        for i in token:
            if i.isdigit():
                d.append(int(i))

        print(d)
        for i in range(0,len(d)-1):
            if d[i] >= d[i+1]:
                return False

        return True  
