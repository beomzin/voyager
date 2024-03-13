const empCtrl = require('../controllers/empController')
const router = require('express').Router()

router.route('/')
    .get(empCtrl.getEmps)

module.exports = router