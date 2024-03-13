const con = require('../dbConfig')

const empCtrl ={
    getEmps : async (req, res) => {
        con.query(`SELECT emp_no AS no, last_name AS name, gender, DATE_FORMAT(birth_date, '%M %d, %Y') AS birth FROM employees LIMIT 20`, (error, rows) => {
            if(error) throw error
            res.send(rows)
        })
    }
}

module.exports = empCtrl