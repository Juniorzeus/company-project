from random import *

users = list(range(1, 21))
shuffle(users)

chciken = sample(users,1)
remain_users = set(users) - set(chciken)
coffee = sample(remain_users,3)

print("-- 당첨자 발표 --")
print("치킨 당첨자:",chciken)
print("커피 당첨자:",coffee)
print("-- 축하합니다 --")