import random
word_bank = ['guava', 'matia', 'disha', 'love', 'daisy', 'tulip']
word = random.choice(word_bank)
guessword =['_']*len(word)
attempts = 7

# game loop 
while attempts>0:
    print('\nCurrent word:'+' '.join(guessword))
    guess = input('Guess a letter: ').lower()
    if guess in word:
        for i in range(len(word)):
            if word[i] == guess:
                guessword[i] = guess
        print('Greate guess!')
    else:
        attempts -= 1
        print('Wrong guess! Attempts left: '+ str(attempts))
    if'_' not in guessword:
        print('\nCongratulations!! You guessed the word: '+ word)
        break
    else:
        print('\nYou have run out of attempts! The word was: '+ word[:1])
    
