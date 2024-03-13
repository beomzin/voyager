var template = require('./template.js');
var db = require('./db.js');

exports.home = function(request, response){
    db.query('SELECT * FROM topic', function(error, topics){
        db.query('SELECT * FROM author', function(error2, authors){
            var title = 'Author List';
            var list = template.list(topics);
            var html = template.HTML(title, list,
            `
            <h2>${title}</h2>
            ${template.authorTable(authors)}
            <style>
                table{
                    border-collapse: collapse;
                }
                td{
                    border: 1px solid #000000;
                }
            </style>
            `,
            ``
            );
            response.writeHead(200);
            response.end(html);
        });
    })
}