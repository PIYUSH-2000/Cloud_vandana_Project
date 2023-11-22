function reverseWordsInSentence(sentence) {
    var words = sentence.split(' ');
    var reversedWords = words.map(function(word) {
        return word.split('').reverse().join('');
    });
    var reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}
var inputSentence = "Hello World JavaScript";
var reversedSentence = reverseWordsInSentence(inputSentence);

console.log("Original Sentence: " + inputSentence);
console.log("Reversed Sentence: " + reversedSentence);
