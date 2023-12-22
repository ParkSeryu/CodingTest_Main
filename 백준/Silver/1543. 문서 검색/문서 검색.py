doc = input()
word = input()
answer = 0
rdoc = doc.replace(word, '')
length = len(doc) - len(rdoc)
answer += length // len(word)

print(answer)
