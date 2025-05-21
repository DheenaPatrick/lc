class Solution:

    def solve(self,num):
        less_than_twenty={0:'',1:'One',2:'Two',3:'Three',4:'Four',5:'Five',6:'Six',7:'Seven',8:'Eight',9:'Nine',10:'Ten',11:'Eleven',12:'Twelve',13:'Thirteen',14:'Fourteen',15:'Fifteen',16:'Sixteen',17:'Seventeen',18:'Eighteen',19:'Nineteen'}
        less_than_hundred={2:'Twenty',3:'Thirty',4:'Forty',5:'Fifty',6:'Sixty',7:'Seventy',8:'Eighty',9:'Ninety'}

        if num<20:
            return less_than_twenty[num]
        elif num<100:
            first=less_than_hundred[num//10]
            last=less_than_twenty[num%10]
            return first + (' '+last if last else "")
        elif num<1000:
            first=self.solve(num//100)+' Hundred'
            last=self.solve(num%100)
            return first + (' '+last if last else "")
        elif num<1000000:
            first=self.solve(num//1000)+' Thousand'
            last=self.solve(num%1000)
            return first + (' '+last if last else "")
        elif num<1000000000:
            first=self.solve(num//1000000)+' Million'
            last=self.solve(num%1000000)
            return first + (' '+last if last else "")
        else:
            first=self.solve(num//1000000000)+' Billion'
            last=self.solve(num%1000000000)
            return first + (' '+last if last else "")


    def numberToWords(self, num: int) -> str:
        if num==0:
            return 'Zero'
        return self.solve(num)
        