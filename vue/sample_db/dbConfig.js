const fs = require('fs')

const data = fs.readFileSync('./database.json')
const conf = JSON.parse(data)
const mysql = require('mysql')

const con = mysql.createConnection({
     host: '127.0.0.1', // conf.host
     user: conf.user, // 'test'
     password: conf.password,
     port: conf.port,
     database: conf.database
})

con.connect()

module.exports = con