const crypto = require('crypto');
const {encrypt, decrypt} = require('./decrypt');

const algorithm = 'aes-256-cbc';
const encryptionKey = crypto.randomBytes(32);
const plainText = 'This is a secret message!';
const iv = crypto.randomBytes(16);
const encryptedbase64Data = encrypt(plainText, encryptionKey, iv, algorithm)


const encodedIV = Buffer.from(iv).toString('base64');
const encodeKey = Buffer.from(encryptionKey).toString('base64');
console.log("encryptedText", encryptedbase64Data);

const decryptedData = decrypt(encryptedbase64Data, encodeKey, encodedIV , algorithm)
console.log("decryptedData", decryptedData);
