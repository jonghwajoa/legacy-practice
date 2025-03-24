const crypto = require('crypto');

const encrypt = (plainText, encryptionKey, iv, algorithm) => {
    const cipher = crypto.createCipheriv(algorithm, encryptionKey, iv);
    let encrypted = cipher.update(plainText, 'utf-8', 'hex');
    encrypted += cipher.final('hex');
  
    const encryptedbase64Data = Buffer.from(encrypted, 'hex').toString('base64');
  
    return encryptedbase64Data;
  }


const decrypt = (encodedEncryptedText, encodedKey, encodedIv, algorithm) => {
    const key = Buffer.from(encodedKey, 'base64');
    const iv =  Buffer.from(encodedIv, 'base64');
    const encryptedText = Buffer.from(encodedEncryptedText, 'base64');
    
    const decipher = crypto.createDecipheriv(algorithm, key, iv);
    let decrypted = decipher.update(encryptedText, 'hex', 'utf-8');
    decrypted += decipher.final('utf-8');
  
    return decrypted;
  }

  module.exports = {
    decrypt,
    encrypt
  };
