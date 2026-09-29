class Solution:
    def findRestaurant(self, list1: list[str], list2: list[str]) -> list[str]:
        ans = []
        mincount = float('inf')
        i = 0
        for l1 in list1:
            j = 0
            for l2 in list2:
                if l1 == l2:
                    count = i + j
                    if count < mincount:
                        ans = [l1]
                        mincount = count
                    elif count == mincount:
                        ans.append(l1)
                j = j + 1
            i = i + 1
        return ans