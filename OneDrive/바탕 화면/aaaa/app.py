import bcrypt as bcrypt
from flask import Flask, render_template, request, jsonify, app, redirect, url_for
from flask import session, escape
app = Flask(__name__)
app.secret_key ="My_Key"

from pymongo import MongoClient
client = MongoClient('mongodb+srv://test:sparta@cluster0.b56nhol.mongodb.net/Cluster0?retryWrites=true&w=majority')
db = client.dbsparta

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/signin')
def signin():
    return render_template('signin.html')

@app.route('/signup')
def signup():
    return render_template('signup.html')

@app.route('/signup/give', methods=["POST"])
def signUpPost():
    id_receive = request.form["id_give"]
    name_receive = request.form["name_give"]
    pw_receive = request.form["pw_give"]

    hashedPassword = bcrypt.hashpw(pw_receive.encode('utf-8'), bcrypt.gensalt())
    hashedPassword = hashedPassword.decode()

    doc = {
        'id': id_receive,
        'name': name_receive,
        'pw': hashedPassword
    }
    db.users.insert_one(doc)
    return jsonify({'msg': '가입완료!'})

@app.route('/signup/check', methods=["GET"])
def signUpGet():
    userList = list(db.users.find({}, {'_id': False}))
    return jsonify({'users': userList})

@app.route('/signin/give', methods=["POST"])
def signInGive():
    id_receive = request.form["id_give"]
    pw_receive = request.form["pw_give"]

    user = list(db.users.find({'id': id_receive}, {'_id': False}))
    if len(user) > 0 and bcrypt.checkpw(pw_receive.encode('utf-8'), user[0]['pw'].encode('utf-8')):
       doc = {
            'userid': user[0]['id'],
            'username': user[0]['name']
        }
       return jsonify({'error': None, 'data': doc})
    else:
        return jsonify({'error': 'login-fail'})

@app.route('/logout')
def end():
    return render_template('/')

if __name__ == '__main__':
    app.run('0.0.0.0', port=5000, debug=True)